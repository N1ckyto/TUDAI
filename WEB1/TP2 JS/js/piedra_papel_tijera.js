"use strict"
let btn = document.querySelector('#btn-play');
btn.addEventListener('click', jugar);

// arreglo con todas las opciones posibles
let opciones = ['PIEDRA', 'PAPEL', 'TIJERA'];

function jugar() {
    // numero random entre 0 y el tamaño del arreglo
    let random = Math.floor((Math.random() * opciones.length));
    let opcion = opciones[random];
    // escribimos el resultado en el html
    document.querySelector('.result').innerHTML = opcion;
}