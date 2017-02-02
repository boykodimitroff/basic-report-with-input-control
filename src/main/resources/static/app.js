(function() {
    'use strict';

    var app = angular.module('BasicReport', []);

    app.controller('BasicReportController', BasicReportController);

    BasicReportController.$inject = [ '$scope', 'InputControlsResource', 'ReportDataResource', 'ReportChartService'];

    function BasicReportController($scope, InputControlsResource, ReportDataResource, ReportChartService) {

        InputControlsResource.getData().success(function(response) {
            $scope.inputControlData = response;
        });

        $scope.executeReport = function(id) {
            ReportDataResource.getData(id).then(function(response) {
                ReportChartService.populateChart(response.data);
            })
        }

    }

})();