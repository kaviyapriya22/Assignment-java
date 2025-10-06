let employees = [
  { id: 1, name: "Ravi", salary: 30000 },
  { id: 2, name: "Neha", salary: 45000 },
  { id: 3, name: "Ajay", salary: 25000 }
];

let totalPayroll = employees.reduce((sum, e) => sum + e.salary, 0);
console.log("Total Payroll:", totalPayroll);

employees = employees.map(e => ({ ...e, salary: e.salary * 1.1 }));
console.log("After 10% Increment:", employees);

let highestSalary = employees.reduce((max, e) => e.salary > max.salary ? e : max, employees[0]);
console.log("Highest Salary Employee:", highestSalary);


employees.push({ id: 4, name: "Anita", salary: 40000 });
console.log("Updated Employees:", employees);
