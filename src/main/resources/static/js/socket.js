var interval_time = 60000;

var socket = new SockJS('/endpointDashboard');


function capacityDashBoard() {
    var stompClient = Stomp.over(socket);
    var data = [];
    stompClient.connect({},function(frame) {
        stompClient.subscribe("/dashboard",function(message) {
            var msg = JSON.parse(message.body);
            data.push(msg);
            if(data.length>16){
                data.shift();
            }
            setCapacityOption(data);
        })
    })
}

function checkRateDashBoard() {
    var stompClient = Stomp.over(socket);
    stompClient.connect({},function (frame) {
        stompClient.subscribe("/checkRate",function (message) {
            var msg = JSON.parse(message.body);
            // TODO setRateOption
        })
    })
}

//加载层-默认风格
capacityDashBoard();

