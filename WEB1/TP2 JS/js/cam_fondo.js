
cambiar_fondos();

function cambiar_fondo() {
    document.getElementById("fondo_div_id").classList.add("fondo_prendido");
    document.getElementById("fondo_div_id").classList.remove("fondo_apago");
}

function cambiar_fondos() {
    document.getElementById("fondo_div_id").classList.add("fondo_apago");
    document.getElementById("fondo_div_id").classList.remove("fondo_prendido");
}