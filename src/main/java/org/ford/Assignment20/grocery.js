let inventory = [
  { item: "Rice", quantity: 20, price: 40 },
  { item: "Wheat", quantity: 15, price: 35 },
  { item: "Sugar", quantity: 10, price: 50 }
];
inventory.push({ item: "Salt", quantity: 25, price: 20 });


let rice = inventory.find(i => i.item === "Rice");
if (rice) rice.price = 45;


let totalStockValue = inventory.reduce((total, i) => total + (i.quantity * i.price), 0);
console.log("Total Stock Value:", totalStockValue);


let lowStock = inventory.filter(i => i.quantity < 15);
console.log("Low Stock Items:", lowStock);
