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