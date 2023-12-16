// Bu yerda JavaScript funksiyalari bo'ladi

// Savatchaga kitob qo'shish
function addToCart(bookId) {
    // Kitobni savatchaga qo'shish logikasi
    var bookName = "Kitob " + bookId + " nomi";
    var cartItem = document.createElement("li");
    cartItem.textContent = bookName;
    document.getElementById("cart-items").appendChild(cartItem);
}

// Buyurtma berish
function checkout() {
    // Buyurtma berish logikasi
    var cartItems = document.getElementById("cart-items");
    if (cartItems.children.length > 0) {
        alert("Buyurtma muvaffaqiyatli amalga oshirildi!");
        cartItems.innerHTML = ""; // Savatchani tozalash
    } else {
        alert("Savatcha bo'sh!");
    }
}
