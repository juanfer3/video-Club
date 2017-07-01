$(document).ready(function (){
    
$('#aceptar').click(function(e){
    e.preventDefault();
//    var nombre = $('#nombre').val();
//    var genero = $('#genero').val();
//    var duracion = $('#duracion').val();
//    var calificacion = $('#calificacion').val();
//    var estado =$('#estado').val();
//    var ejemplares =$('#ejemplares');
//    var img =$('#img');
    var data = new FormData($("#formulario"));
    alert(data)
    
    $.ajax({
       url:"InsertarPelicula",
       type:"post",
       data:data,
       success: function (datas) {
                alert(datas);
            }
    });
    
});




});


