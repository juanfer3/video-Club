$(document).ready(function () {
alertify.alert("hola");
   
    $("#login").click(function () {

        $.post('login.jsp', function (tabla) {

            $('#ocultarindex').hide('slow');
            $('#divlogin').html(tabla).show("slow");
        });
    });

    $('#inside').click(function (tabla) {
        $.post('jsp/contenidoIndex.jsp', function (tabla) {
            $('#divlogin').hide('slow');
            $('#ocultarindex').html(tabla).show('slow');
        });
    });
    
   
    
//    $('#aceptar').click(function(e){
//       e.preventDefault();
//       var img=$('#imagen').val();
//        alert(img);
//        
//        
//    });
    var i=0;
    $("#archivoadicional").on("click",function()
    {
    var file = $("form input:file")[i].files[i];
 
    $('form input:file').last().after($('<span> Archivo para subir: "'+file.name+'"<br> <input type="file" id="archivo" name="archivo[]" /></span>'));
        i++;
        alert(i);
    });//fin
    
    
    

});


