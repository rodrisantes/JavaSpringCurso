// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();

  $('#tables').DataTable();
});

   async function cargarUsuarios(){

    const usuarios = await fetch("/usuarios").then(res => res.json());

        let listadoHtml = '';
    for (let usuario of usuarios){
    let usuarioHtml =  '<tr><th>' + usuario.id + '</th><th>' + usuario.nombre + ' ' + usuario.apellido + '</th><th>' + usuario.email + '</th><th>' + usuario.telefono + '</th><th><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></th></tr>'

    listadoHtml += usuarioHtml
}
document.querySelector('#tables tbody').outerHTML = listadoHtml;
    }

;