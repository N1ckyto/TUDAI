let btn = document.querySelectorAll(".btn");
comienzo();
async function comienzo() {
    let contenedor = document.querySelector(".container");
    try {
        let result = await fetch("pages/panda.html");
        if (result.ok) {
            let cont = result.text();
            contenedor.innerHTML = cont;
        } else {
            contenedor.innerHTML = "error1";
        }
    } catch (error) {
        contenedor.innerHTML = "error2";
    }
}
for (let i = 0; i < btn.length; i++) {
    btn[i].addEventListener("click", (event) => push(event));
}

window.addEventListener("popstate", (event) => {
    let stateId = event.state.id;
    console.log("stateId", stateId);
    Select_tab(stateId);
    Load_content(stateId);
});

function push(event) {
    let id = event.target.id;
    document.title = id;
    load_content(id);
    window.history.pushState({ id }, `${id}`, `/page/${id}`);
}

async function load_content(id) {
    console.log("Loading content for (" + id + "}");
    let cont = document.querySelector(".container");
    try {
        let response = await fetch(`${window.location.origin}/WEB1/TP3 AJAX/ejer6/pages/${id}.html`);
        //${window.location.origin} lo que haces es posicionarme en la raiz del sitio, en este caso se pone todo eso
        //porque tenes todo en la misma carpeta y tiene que ir al punto exacto, entoces tiene que recorrer todas las
        //carpetas para poder llegar a pages.
        if (response.ok) {
            let content = await response.text();
            cont.innerHTML = content;
        } else {
            cont.innerHTML = "error loading for /" + id + "...";
        }
    } catch (error) {
        cont.innerHTML = "Error";
    }
}