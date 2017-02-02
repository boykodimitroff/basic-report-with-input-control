(function () {
    'use strict';

    angular.module('BasicReport').factory('ReportChartService', ReportChartService);

    function ReportChartService() {
        var service = {};

        service.populateChart = function (data) {
            var chart = new Highcharts.Chart({
                chart: {
                    type: 'column',
                    renderTo: 'reportChart'
                },
                title: {
                    text: 'Sales Data'
                },
                xAxis: {
                    categories: data.xAxis,
                },
                plotOptions: {
                    column: {
                        stacking: 'normal',
                    }
                },
                series: [ { data: data.yAxis }]
            })
        }

        return service;
    }
})();
