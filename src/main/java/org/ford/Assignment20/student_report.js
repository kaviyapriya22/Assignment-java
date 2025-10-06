let students = [
  { name: "Rahul", marks: 78 },
  { name: "Sneha", marks: 92 },
  { name: "Amit", marks: 45 },
  { name: "Priya", marks: 60 }
];

let passed = students.filter(s => s.marks >= 50);
console.log("Passed Students List :", passed);

let avgMarks = students.reduce((sum, s) => sum + s.marks, 0) / students.length;
console.log("Average marks :", avgMarks);


let sortedStudents = [...students].sort((a,b) => b.marks - a.marks);
console.log("sorted based on marks: ", sortedStudents);


students = students.map(s => {
  let grade;
  if (s.marks >= 90) grade = "A";
  else if (s.marks >= 70) grade = "B";
  else if (s.marks >= 50) grade = "C";
  else grade = "F";
  return {...s, grade};
});
console.log("Students with their Grades:", students);
