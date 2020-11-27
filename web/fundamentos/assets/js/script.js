let nome = document.querySelector('#nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOK = false
let emailOK = false
let assuntoOK = false
let mapa = document.querySelector('#mapa')

function validaNome() {
    let txt = document.querySelector('#txtNome')
    
    if (nome.value == '') {
        txt.style.display = 'none'
        nomeOK = false
    } else if (nome.value.length < 3) {
        txt.innerHTML = 'Nome inválido'
        txt.classList.add('alert-success')
        txt.classList.add('alert-danger')
        nomeOK = false
    } else {
        txt.innerHTML = 'Nome válido'
        txt.classList.remove('alert-danger')
        txt.classList.add('alert-success')
        nomeOK = true
    }
}

function validaEmail() {
    let txt = document.querySelector('#txtEmail')
    
    if (email.value == '') {
        txt.style.display = 'none'
        emailOK = false
    } else if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txt.innerHTML = 'Email inválido'
        txt.classList.remove('alert-success')
        txt.classList.add('alert-danger')
        emailOK = false
    } else {
        txt.innerHTML = 'Email válido'
        txt.classList.remove('alert-danger')
        txt.classList.add('alert-success')
        emailOK = true
    }
}

function validaAssunto() {
    let txt = document.querySelector('#txtAssunto')
    
    if (assunto.value == '') {
        txt.style.display = 'none'
        assuntoOK = false
    } else if (assunto.value.length > 100) {
        txt.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
        txt.style.display = 'block'
        txt.classList.add('alert-danger')
        assuntoOK = false
    } else {
        txt.style.display = 'none'
        assuntoOk = true
    }
}

function enviar() {
    if (nomeOK == true && emailOK == true && assuntoOK == true) {
        alert('Formulário enviado com sucesso')
    } else {
        alert('Preencha o formulário corretamente antes de enviar')
    }
}

function mapaZoom() {
    mapa.style.width = '450px'
    mapa.style.height = '450px'
}

function mapaNormal() {
    mapa.style.width = '300px'
    mapa.style.height = '300px'
}