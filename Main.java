// Dummy feedback data (simulate backend)
const feedbackData = [
  { subject: "Maths", rating: 4, faculty: "Mr. Rao" },
  { subject: "Physics", rating: 5, faculty: "Dr. Kumar" },
  { subject: "CS", rating: 4, faculty: "Ms. Anjali" },
  { subject: "Maths", rating: 5, faculty: "Mr. Rao" },
];

// Total Feedbacks
document.getElementById("totalFeedback").innerText = feedbackData.length;

// Average Rating
let total = feedbackData.reduce((sum, f) => sum + f.rating, 0);
let avg = (total / feedbackData.length).toFixed(1);
document.getElementById("avgRating").innerText = avg + " ⭐";

// Best Faculty
const facultyCount = {};
feedbackData.forEach(f => {
  facultyCount[f.faculty] = (facultyCount[f.faculty] || 0) + f.rating;
});
const best = Object.keys(facultyCount).reduce((a, b) =>
  facultyCount[a] > facultyCount[b] ? a : b
);
document.getElementById("bestFaculty").innerText = best;

// Subject-wise bars
document.getElementById("maths").style.width = "80%";
document.getElementById("physics").style.width = "90%";
document.getElementById("cs").style.width = "75%";
