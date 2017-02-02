(function() {
    'use strict'

    var app = angular.module("BasicReport");

    app.factory("ReportDataResource", ReportDataResource);

    ReportDataResource.$inject = ['$http'];

    function ReportDataResource($http) {

        var service = {};

        service.getData = function(id) {
            return $http({
                method : 'GET',
                url : '/sales/data',
                params : {
                    carManufacturerId : id
                }
            });
        }

        return service;
    }

})();