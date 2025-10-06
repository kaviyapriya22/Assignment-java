let library = [
  { title: "The Alchemist", author: "Paulo Coelho", available: true },
  { title: "1984", author: "George Orwell", available: false },
  { title: "Clean Code", author: "Robert C. Martin", available: true }
];

let availableBooks = library.filter(b => b.available);
console.log("Available Books:", availableBooks);


function borrowBook(title) {
  let book = library.find(b => b.title === title);
  if (book && book.available) book.available = false;
}

function returnBook(title) {
  let book = library.find(b => b.title === title);
  if (book) book.available = true;
}


console.log("Available Books Count:", library.filter(b => b.available).length);


borrowBook("The Alchemist");
console.log("After Borrowing:", library);
returnBook("1984");
console.log("After Returning:", library);
