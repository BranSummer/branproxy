
// 监控总容量
var capacityChart = echarts.init(document.getElementById('capacity'));
capacityChart.hideLoading();
// 显示标题，图例和空的坐标轴

var capacityOption = {
    title: {
        text: '代理池容量',
        subtext: '单位/个',
    },
    legend: {
        data:['capacity']
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: []
    },
    yAxis: {
        boundaryGap: [0, '50%'],
        type: 'value'
    },
    tooltip: my_tooltip,
    toolbox: my_toolbox,
    dataZoom: [{
        start:0
    }, {
        type: 'inside'
    }],
    series: [{
        name: 'capacity',
        type: 'line',
        smooth:false,
        symbol: 'none',
        areaStyle: {
            normal: {}
        },
        data: []
    }]
}
capacityChart.setOption(capacityOption);

function setCapacityData(data){
    var list = data;
    capacityChart.setOption({
        xAxis: {
            data: list.map(function (item) {
                return item.date;
            })
        },
        series: [{
            name:'总容量',
            data: list.map(function (item) {
                return item.capacity;
            })
        }]
    });
}

// 监控新加代理
var newlyProxyChart = echarts.init(document.getElementById('newlyProxy'));
newlyProxyChart.hideLoading();

function setNewlyProxyData(data) {
    var list = data;
    newlyProxyChart.setOption({
        title: {
            text: '新入库代理监控'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                label: {
                    backgroundColor: '#283b56'
                }
            }
        },
        legend: {
            data:['新入库个数']
        },
        toolbox: {
            show: true,
            feature: {
                dataView: {readOnly: false},
                restore: {},
                saveAsImage: {}
            }
        },
        dataZoom: {
            show: false,
            start: 0,
            end: 100
        },
        xAxis: [
            {
                type: 'category',
                boundaryGap: true,
                data: list.map(function (item) {
                    return item.date;
                })
            }
        ],
        yAxis: [
            {
                type: 'value',
                scale: true,
                name: 'count',
                boundaryGap: [0.2, 0.2]
            },
            {
                type: 'value',
                scale: true,
                name: 'count',
                boundaryGap: [0.2, 0.2]
            }
        ],
        series: [{
            name:'count',
            type:'bar',
            data: list.map(function (item) {
                return item.count;
            })
        },{
            name:'count',
            type:'line',
            data: list.map(function (item) {
                return item.count;
            })
        }]
    });
}

// 监控高匿代理容量图表
var eliteCapacityChart = echarts.init(document.getElementById('eliteCapacity'));
eliteCapacityChart.hideLoading();
eliteCapacityChart.setOption(capacityOption);
function setEliteCapacityData(data) {
    var list = data;
    capacityChart.setOption({
        xAxis: {
            data: list.map(function (item) {
                return item.date;
            })
        },
        series: [{
            name:'高匿代理容量',
            data: list.map(function (item) {
                return item.capacity;
            })
        }]
    });
}

// 监控透明代理容量图表
var transparentCapacityChart = echarts.init(document.getElementById('transparentCapacity'));
transparentCapacityChart.hideLoading();
transparentCapacityChart.setOption(capacityOption);
function setTransparentCapacityData(data) {
    var list = data;
    capacityChart.setOption({
        xAxis: {
            data: list.map(function (item) {
                return item.date;
            })
        },
        series: [{
            name:'透明代理容量',
            data: list.map(function (item) {
                return item.capacity;
            })
        }]
    });
}

// 监控https代理容量
var httpsCapacityChart = echarts.init(document.getElementById('httpsCapacity'));
httpsCapacityChart.hideLoading();
httpsCapacityChart.setOption(capacityOption);
function setHttpsCapacityData(data) {
    var list = data;
    capacityChart.setOption({
        xAxis: {
            data: list.map(function (item) {
                return item.date;
            })
        },
        series: [{
            name:'HTTPS代理容量',
            data: list.map(function (item) {
                return item.capacity;
            })
        }]
    });
}