const form = document.querySelector("form");

form.addEventListener("submit", function(event) {
    //anula o submit
    event.preventDefault();

    //declaracao de variavel
    let nome = document.querySelector('#nome').value;

    //exibe a caixa de dialogo
    alert(nome);

    //resetar formulario
    form.reset();
    if(nome==""){
        alert("Acesso permitido");
    }
    else{
        alert("Acesso negado ");
    }
});