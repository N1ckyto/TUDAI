"use strict"
let nombre = prompt("nombre:");
let apellido = prompt("apellido:");
let parrafo = document.getElementById("parrafo-saludo");

let btn = document.getElementById("btn-saludo");
btn.addEventListener("click", saludar);



function saludar() {
    parrafo.classList.add("show");
    document.getElementById("mensaje-saludo").innerHTML = nombre + " " + apellido;
}
