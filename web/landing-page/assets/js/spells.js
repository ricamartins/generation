function drag(ev) {
    if (ev.target.tagName == "IMG") {
        ev.dataTransfer.setData("text", ev.target.parentElement.parentElement.children[1].children[0].innerText)    
    } else {
        ev.dataTransfer.setData("text", ev.target.children[1].children[0].innerText)
    }
}

function allowDrop(ev) {
    ev.preventDefault()
}

function drop(ev) {
    ev.preventDefault()
    ev.target.nextElementSibling.appendChild(createListItem(ev.dataTransfer.getData("text")))
}

function createListItem(productName) {

    let item = document.createElement('li')
    item.classList.add('d-flex')
    item.classList.add('bg-light-brown')
    item.innerText = productName

    let deleteButton = document.createElement('button')
    deleteButton.classList.add('btn')
    deleteButton.innerText = 'X'

    deleteButton.addEventListener('mouseover', function(event) {
        let button = event.target
        let listItem = button.parentElement;
        let option = Math.floor(Math.random() * 4)

        //Moves the list item
        if (option == 0) {
            
            listItem.classList.toggle("align-self-end")
            // if (listItem.style.width > 250) {
            //     button.style.width = 0
            //     button.style.heigth = 0
            // } else {
            //     listItem.classList.toggle("align-self-end")
            // }

        //Changes the button position with the text
        } else if (option == 1) {

            listItem.classList.toggle("flex-row-reverse")

        //Makes item invisible
        } else if (option == 2) {

            listItem.style.opacity = 0
        
        //Shrinks the button
        } else {
            listItem.classList.toggle("flex-row-reverse")
            // button.style.width = "0"
            // button.style.heigth = "0"
        }
    })

    deleteButton.addEventListener('mouseout', function(event) {
        let listItem = event.target.parentElement;

        listItem.style.opacity = 1
        // button.style.width = "2em !important"
        // button.style.heigth = "2em"
    })

    deleteButton.addEventListener('click', function(event) {
        let cauldronList = event.target.parentElement.parentElement
        let listItem = event.target.parentElement;
        cauldronList.removeChild(listItem)
    })


    item.appendChild(deleteButton)

    return item
}

//Expanding letter as typing
document.getElementsByTagName('textarea')[0].addEventListener('keydown', () => {
    let textArea = document.getElementsByTagName('textarea')[0]
    
    setTimeout(function() {
        textArea.style.height = 'auto'
        textArea.style.height = textArea.scrollHeight + "px"
        let textAreaHeight = parseInt(textArea.style.height.slice(0, -2)) - 28
        document.getElementsByClassName("letter")[0].style.backgroundSize = "470px " + (600 + textAreaHeight) + "px"
    }, 0)
})

//Validating form fields
let name = document.querySelector('#name')
let email = document.querySelector('#email')
let wondering = document.querySelector('#wondering')

let nomeOK = false
let emailOK = false
let wonderingOK = false

name.addEventListener('keyup', () => {
    let alert = document.querySelector('#alertName')
    
    if (name.value == '') {
        alert.style.display = 'none'
        nameOK = false
    } else if (name.value.length < 3) {
        alert.innerHTML = 'Invalid name'
        alert.classList.remove('alert-success')
        alert.classList.add('alert-danger')
        nameOK = false
    } else {
        alert.innerHTML = 'Valid name'
        alert.classList.remove('alert-danger')
        alert.classList.add('alert-success')
        nameOK = true
    }
})

email.addEventListener('keyup', () => {
    let alert = document.querySelector('#alertEmail')
    
    if (email.value == '') {
        alert.style.display = 'none'
        emailOK = false
    } else if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        alert.innerHTML = 'Invalid email'
        alert.classList.remove('alert-success')
        alert.classList.add('alert-danger')
        emailOK = false
    } else {
        alert.innerHTML = 'Valid email'
        alert.classList.remove('alert-danger')
        alert.classList.add('alert-success')
        emailOK = true
    }
})

wondering.addEventListener('keyup', () => {
    let alert = document.querySelector('#alertWondering')
    
    if (wondering.value == '') {
        alert.style.display = 'none'
        wonderingOK = false
    } else if (wondering.value.length > 140) {
        alert.innerHTML = 'Your message is too long. Max lenght is 140 characters'
        alert.style.display = 'block'
        alert.classList.add('alert-danger')
        wonderingOK = false
    } else {
        alert.style.display = 'none'
        wonderingOK = true
    }
})

//Sending owl
document.querySelector("#sumbit-button").addEventListener('click', (event) => {
    if (nameOK == true && emailOK == true && wonderingOK == true) {
        alert('The owl is taking off!')

    } else {
        event.preventDefault()
        alert('Fill the form correctly')
    }
})

// Zoom in and out on the map 
let map = document.querySelector('.map')

map.addEventListener('mouseover', () => {
    map.style.backgroundSize = "1080px 850px"
    map.style.backgroundPosition = "60% 60%"
})

map.addEventListener('mouseout', () => {
    map.style.backgroundSize = "735px 570px"
    map.style.backgroundPosition = "0% 0%"
})

map.addEventListener('transitionstart', () => {
    map.children[1].children[0].style.display = "none"
})

map.addEventListener('transitionend', () => {
    map.children[1].children[0].style.display = "block"
})