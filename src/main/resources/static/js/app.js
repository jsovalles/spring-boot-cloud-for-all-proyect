const boton = document.querySelector('#agregar-product');
const listaProductos = document.querySelector('#tabla-productos tbody');

initEventListeners();

var list = [];

function initEventListeners() {

    //event listener when someone clicks a buttom
    boton.addEventListener('click', agregarProducto);

}

function agregarProducto(e) {
    e.preventDefault();

    var lugarId = document.querySelector('#lugar');
    var lugar = lugarId.options[lugarId.selectedIndex].value;
    
    var productoId = document.querySelector('#producto');
    var producto = productoId.options[productoId.selectedIndex].value;
    var productName =productoId.options[productoId.selectedIndex].text;
    
    var cantidad = document.querySelector('#cantidad').value;
    
    const infoProducto = {
        cantidad: Number(cantidad),
    	producto: {
    		id: Number(producto)
    	},
    	lugar: lugar
    }

    list.push(infoProducto);
    
    insertarValor(infoProducto, productName);
}

function insertarValor(infoProducto, productName) {
    const row = document.createElement('tr');
    row.innerHTML = `
        <td>${productName} </td>
        <td>${infoProducto.cantidad} </td>
        <td>${infoProducto.lugar}</td>
    `;
    listaProductos.appendChild(row);
}