var interval_time = 60000;

var socket = new SockJS('/endpointDashboard');
function checkRateDashBoard() {
    var stompClient = Stomp.over(socket);
    stompClient.connect({},function (frame) {
        stompClient.subscribe("/checkRate",function (message) {
            var msg = JSON.parse(message.body);
            setRateOption(msg);
        })
    })
}
// 速率看板启动
checkRateDashBoard();
