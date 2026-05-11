const form = document.querySelector("form")

form.addEventListener("submit", (event) => {

    event.preventDefault()

    let altura = document.querySelector("#altura").value.replace(",", ".")
    let peso = document.querySelector("#peso").value.replace(",", ".")

    altura = parseFloat(altura)
    peso = parseFloat(peso)

    let imc = peso / (altura * altura)

    imc = imc.toFixed(2)

    const resultado = document.querySelector("#result")

    if(imc < 18.5){
        resultado.innerHTML = `Magreza - IMC: ${imc}`
    }

    else if(imc < 25){
        resultado.innerHTML = `Peso normal - IMC: ${imc}`
    }

    else if(imc < 30){
        resultado.innerHTML = `Sobrepeso - IMC: ${imc}`
    }

    else{
        resultado.innerHTML = `Obesidade - IMC: ${imc}`
    }

})