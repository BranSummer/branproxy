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

function newlyProxyCount() {
    var stompClient = Stomp.over(socket);
    var data = [];
    stompClient.connect({},function(frame) {
        stompClient.subscribe("/newlyProxy",function(message) {
            var msg = JSON.parse(message.body);
            data.push(msg);
            if(data.length>16){
                data.shift();
            }
            setNewlyProxyOption(data);
        })
    })
}


// 容量看板启动
capacityDashBoard();

// 性入表看板启动
newlyProxyCount();
