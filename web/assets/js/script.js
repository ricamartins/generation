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
        txt.innerHTML = ''
        nomeOK = false
    } else if (nome.value.length < 3) {
        txt.innerHTML = 'Nome inválido'
        txt.style.color = 'red'
        nomeOK = false
    } else {
        txt.innerHTML = 'Nome válido'
        txt.style.color = 'green'
        nomeOK = true
    }
}

function validaEmail() {
    let txt = document.querySelector('#txtEmail')
    
    if (email.value == '') {
        txt.innerHTML = ''
        emailOK = false
    } else if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txt.innerHTML = 'Email inválido'
        txt.style.color = 'red'
        emailOK = false
    } else {
        txt.innerHTML = 'Email válido'
        txt.style.color = 'green'
        emailOK = true
    }
}

function validaAssunto() {
    let txt = document.querySelector('#txtAssunto')
    
    if (assunto.value.length == '') {
        txt.innerHTML = ''
        assuntoOK = false
    } else if (assunto.value.length > 100) {
        txt.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
        txt.style.color = 'red'
        assuntoOK = false
    } else {
        txt.innerHTML = ''
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
    mapa.style.width = '600px'
    mapa.style.height = '600px'
}

function mapaNormal() {
    mapa.style.width = '300px'
    mapa.style.height = '300px'
}