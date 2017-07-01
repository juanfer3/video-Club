$(document).ready(function (){
   
//    alertify.alert("hola edito");
  $('#aceptarEdicion').off('click');
  $('#aceptarEdicion').on('click',function (){
      alertify.confirm("Guardar Cambios",function (e){
          
          if(e){
              
              alertify.success("Cambios Guardados");
              
              
          }else{
              
              
              alertify.error("Cancelar");
              
          }
          
      });
      
      
  });
    
    
    
});
