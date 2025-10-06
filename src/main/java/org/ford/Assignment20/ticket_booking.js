let bookings = [
  { name: "John", movie: "Inception", seats: 2 },
  { name: "Sara", movie: "Interstellar", seats: 3 },
  { name: "Alex", movie: "Inception", seats: 1 }
];


let inceptionSeats = bookings
  .filter(b => b.movie === "Inception")
  .reduce((total, b) => total + b.seats, 0);
console.log("Total seats", inceptionSeats);


bookings.push({ name:"kaviya", movie:"saiyaara", seats: 2 });


let uniqueMovies = [...new Set(bookings.map(b => b.movie))];
console.log("Unique Movies:", uniqueMovies);

let totalSeats = bookings.reduce((sum, b) => sum + b.seats, 0);
console.log("Seats Booked:", totalSeats);
