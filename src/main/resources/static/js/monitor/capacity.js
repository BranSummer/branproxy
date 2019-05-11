
// 监控总容量
var capacityChart = echarts.init(document.getElementById('capacity'));
capacityChart.hideLoading();
// 显示标题，图例和空的坐标轴
capacityChart.setOption({
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
});

function setCapacityOption(data){
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


function setNewlyProxyOption(data) {
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
