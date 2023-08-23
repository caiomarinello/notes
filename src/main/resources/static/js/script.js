const toggleButton = document.getElementById("toggle-button");
const body = document.body;

toggleButton.addEventListener("click", () => {
    body.classList.toggle("dark-mode");

    // Toggle darkMode variable
    const darkMode = body.classList.contains("dark-mode");
    // Send the value to the server (e.g., via AJAX) to persist user's preference
});