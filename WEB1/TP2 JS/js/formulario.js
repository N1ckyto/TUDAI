"use strict"
let form = document.querySelector(".formulario");
form.addEventListener("submit", funciona);

function funciona(e) {
    e.preventDefault();

    let formData = new FormData(form);
    let nombre = formData.get('nombre');
    let apellido = formData.get('apellido');
    let dni = formData.get('dni');
    let email = formData.get('email');

    console.log(nombre, apellido, dni, email);
}
