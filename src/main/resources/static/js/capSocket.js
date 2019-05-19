
var socket = new SockJS('/endpointDashboard');


function capacityDashBoard() {
    var stompClient = Stomp.over(socket);
    var capacityData = [];
    var newlyData = [];
    var eliteData = [];
    var transparentData = [];
    var httpsData = [];
    stompClient.connect({},function(frame) {
        // 订阅代理总容量消息
        stompClient.subscribe("/dashboard",function(message) {
            var msg = JSON.parse(message.body);
            capacityData.push(msg);
            if(capacityData.length>16){
                capacityData.shift();
            }
            setCapacityData(capacityData);
        });
        // 订阅新加入代理消息
        stompClient.subscribe("/newlyProxy",function(message) {
            var msg = JSON.parse(message.body);
            newlyData.push(msg);
            if(newlyData.length>16){
                newlyData.shift();
            }
            setNewlyProxyData(newlyData);
        });
        // 订阅高匿代理容量消息
        stompClient.subscribe("/eliteCapacity",function(message) {
            var msg = JSON.parse(message.body);
            eliteData.push(msg);
            if(eliteData.length>6){
                eliteData.shift();
            }
            setEliteCapacityData(eliteData);
        });
        // 订阅透明代理容量消息
        stompClient.subscribe("/transparentCapacity",function(message) {
            var msg = JSON.parse(message.body);
            transparentData.push(msg);
            if(transparentData.length>6){
                transparentData.shift();
            }
            setTransparentCapacityData(transparentData);
        });
        // 订阅https代理容量消息
        stompClient.subscribe("/httpsCapacity",function(message) {
            var msg = JSON.parse(message.body);
            httpsData.push(msg);
            if(httpsData.length>6){
                httpsData.shift();
            }
            setHttpsCapacityData(httpsData);
        });

    })
}


// 容量看板启动
capacityDashBoard();


