var personManagerModule = angular.module('personApp', []);

personManagerModule.controller('personManagerController', function ($scope,$http) {
 
 $scope.id = 0;
 $scope.person; 
// $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded"; http://localhost:8080/frontPerson/if ($scope.id != 0) {
  
 // toggle selection for a given task by task id
   $scope.personSelection = function () {
	   
    	 $http({method: 'GET', url: 'mvc-angularjs/person/' + $scope.id}).
    	 success(function(data) {    		 
    		 $scope.person = data;         
    	 }).error(function(data, status, headers, config) {
    		 alert(status + data);
    		  });    	 
	   
   };
   
   $scope.getAll = function () {
	   $http({method: 'GET', url: 'mvc-angularjs/person/'}).
  	 	success(function(data) {    		 
  		 $scope.persons = data;         
  	 }).error(function(data, status, headers, config) {
  		 alert(status + data);
  		  });
	   
   };
   
   $scope.create = function () {
	   $http({method: 'POST', data: $scope.person,url: 'mvc-angularjs/person/'}).
  	 	success(function(data) {    		 
  		 alert('Person saved');
  		 $scope.getAll();
  	 }).error(function(data, status, headers, config) {
  		 alert(status + data);
  		  });
	   
   };
   
   
   $scope.getAll();
 
 
});
