var rateChart = echarts.init(document.getElementById('rate'));

rateChart.hideLoading();

rateChart.setOption({
    backgroundColor: background_color,
    title: {
        subtext: '单位/MB',
        textStyle: {
            color: '#fff'
        }
    },
    xAxis: {
        axisLine: {lineStyle: {color: '#8392A5'}},
        nameTextStyle: {
            color: '#fff'
        },
        data:[]
    },
    yAxis: {
        scale: true,
        axisLine: {lineStyle: {color: '#8392A5'}},
        splitLine: {show: false}
    },
    tooltip: my_tooltip,
    toolbox: my_toolbox,
    dataZoom: [{
        start: 0
    }, {
        type: 'inside'
    }],
    visualMap: [{
        show: false,
        inRange: {
            color: white
        }
    }],
    series: [{
        name: 'rate',
        type: 'line',
        smooth: true,
        symbol: 'none',
        lineStyle: {
            color: colors[0]
        },
        data: []
    }]
});

function setRateOption(data) {
    rateChart.setOption({
        xAxis: {
            data: data.map(function (item) {
                return item.date;
            })
        },
        series: [{
            name: '检活速率',
            data: data.map(function (item) {
                return item.count;
            })
        }]
    });
}