$(function() {
	var $name = $('#name');
	$.ajax({
		url: 'http://localhost:8080/single.page.app/rest/users',
		type: 'get',
		dataType: 'JSON',
		success: function(response) {

			$.each(response, function(i, data) {

				$name.append('<tr><td>' + data.name + '</td><td>' + data.surname + '</td><td>' + data.gender + '</td><td>' + data.birthdate + '</td><td>' + data.workaddress + '</td><td>' + data.homeaddress + '</td></tr>')

			});

		},
		error: function() {
			alert("error loading data");
		}
	});
	
	

});
