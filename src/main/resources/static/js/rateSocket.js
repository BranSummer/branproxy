
var socket = new SockJS('/endpointDashboard');
function checkRateDashBoard() {
    var stompClient = Stomp.over(socket);
    var publicQueueRateData = [];

    stompClient.connect({},function (frame) {
        // 回收速率监控
        stompClient.subscribe("/checkRate",function (message) {
            var msg = JSON.parse(message.body);
            setRateOption(msg);
        });
        // 公共队列自检监控
        stompClient.subscribe("/publicQueueRate",function(message) {
            var msg = JSON.parse(message.body);
            publicQueueRateData.push(msg);
            if(publicQueueRateData.length>6){
                publicQueueRateData.shift();
            }
            setPublicQueueRateOption(publicQueueRateData);
        });

    });

}

function publicQueueRateBoard() {
    var stompClient = Stomp.over(socket);
    var data = [];
    stompClient.connect({},function(frame) {
        stompClient.subscribe("/publicQueueRate",function(message) {
            var msg = JSON.parse(message.body);
            data.push(msg);
            if(data.length>6){
                data.shift();
            }
            setPublicQueueRateOption(data);
        });
    })
}

// 回收速率看板启动
checkRateDashBoard();

