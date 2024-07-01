let btn = document.querySelectorAll(".btn");
for (let i = 0; i < btn.length; i++) {
    btn[i].addEventListener("click", (event) => push(event));
}

function push(event) {
    let id = event.target.id;
    document.title = id;
    load_content(id);
    window.history.pushState({ id }, `${id}`, `/page/${id}`);
}

async function load_content(id) {
    let cont = document.querySelector(".container");
    try {
        let response = await fetch(`${window.location.origin}/WEB1/TP3 AJAX/ejer6/pages/${id}.html`);
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