
//折线颜色
var colors = ['#cc0033', '#ff5722', '#2196f3', '#4caf50'];
//点
var white = null;
//背景色
var background_color = '#21202D';

var my_tooltip = {
        trigger: 'axis',
        axisPointer: {
            animation: false,
            type: 'cross',
            lineStyle: {
                color: '#376df4',
                width: 2,
                opacity: 1
            }
        }
    };
var my_toolbox ={
    feature: {
        dataZoom: {
            yAxisIndex: 'none'
        },
        restore: {},
        saveAsImage: {},
        magicType: {
            type: []
        }
    }
};

