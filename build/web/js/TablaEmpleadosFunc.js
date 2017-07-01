$(document).ready(function (){
//   alertify.alert("hola"); 
    $('.ver').off('click');
    $('.ver').on('click', function(){
        
       alertify.success("soy ver");
        
    });
    
    $('.editar').off('click');
    $('.editar').on('click', function(){
       
//        alertify.success("soy editar");

    var id=$(this).parents('tr').find('.id').text();
    alertify.success(id);
    $('.tablaEmpleados').load("jsp/TablaEditarEmpleados.jsp",{id:id},function (){
        
            alertify.alert("estoy cargando");
        
    });

        
    });
    
    
    $('.eliminar').off('click');
    $('.eliminar').on('click', function(){
       
        alertify.success("soy eliminar");
        
    });
    

});