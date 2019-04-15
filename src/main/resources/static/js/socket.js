var interval_time = 60000;


function capacityDashBoard() {
    var socket = new SockJS('/endpointDashboard');
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

//加载层-默认风格
capacityDashBoard();

