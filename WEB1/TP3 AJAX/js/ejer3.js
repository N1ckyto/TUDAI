let btn = document.querySelectorAll(".btn_show");
for (let i = 0; i < btn.length; i++) {
    btn[i].addEventListener("click", mostrar);
}

async function mostrar(e) {
    e.preventDefault()
    let container = document.querySelector(".container");
    container.innerHTML = "<h1> Loading... </h1>";
    try {
        let response = await fetch("https://web-unicen-service.onrender.com/api/html");
        if (response.ok) {
            let t = await response.text();
            processText(t);
        } else
            container.innerHTML = "<h1>Error - Failed URL!</h1>";
    }
    catch (error) {
        container.innerHTML = "<h1>Connection error</h1>";
    };
}

function processText(t) {
    let container = document.querySelector(".container");
    container.innerHTML = t;
    container.querySelectorAll(".js-comportamiento").forEach(b => b.addEventListener("click", mostrar_alert));
}

function mostrar_alert() {
    alert("entro en el boton del 2 html");
}