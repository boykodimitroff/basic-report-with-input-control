(function() {
    'use strict'

    var app = angular.module("BasicReport");

    app.factory("InputControlsResource", InputControlsResource);

    InputControlsResource.$inject = ['$http'];

    function InputControlsResource($http) {

        var service = {};

        service.getData = function() {
            return $http({
                method : 'GET',
                url : '/input-control/data'
            });
        }

        return service;
    }

})();