// Dark mode button
const toggleButton = document.getElementById("toggle-button");
const body = document.body;

toggleButton.addEventListener("click", () => {
    body.classList.toggle("dark-mode");

    // Toggle darkMode variable
    const darkMode = body.classList.contains("dark-mode");
    // Send the value to the server (e.g., via AJAX) to persist user's preference
});
// End of dark mode button

// home.html create alarm form
document.getElementById("alarm-form").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent the default form submission
    console.log("Form submit event triggered."); 

    const timeInput = document.getElementById("time").value;
    const formattedTime = timeInput; // Just the time input value without changes

    const alarmData = {
        title: document.getElementById("title").value,
        time: formattedTime,
        enabled: document.getElementById("enabled").checked,
        message: document.getElementById("message").value
    };

    fetch("/alarms", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(alarmData)
    }).then(response => {
        if (response.ok) {
            return response.json(); // Parse the response body as JSON
        } else {
            throw new Error("Request failed with status: " + response.status);
        }
    }).then(data => {
        // Handle successful response, if needed
        console.log("Alarm created:", data);
    }).catch(error => {
        console.error("Error:", error);
    });
});
// end of form
