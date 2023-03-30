//the main function must occur after the page is loaded, hence being inside the wondow.onload event handler.
function checkInvalidInput(element) {
  if (element.type === "checkbox") {
    return !element.checked;
  } else if (element.type === "text") {
    return element.value.length === 0;
  } else if (element.tagName.toLowerCase() === "textarea") {
    return element.value.length === 0;
  }
  return false;
}

function highlightError(element, bol) {
  if (bol) {
    element.style.backgroundColor = "red";
    element.parentNode.style.backgroundColor = "red";
  } else {
    element.removeAttribute("style");
    element.parentNode.removeAttribute("style");
  }
}

window.onload = function () {
  const mainForm = document.getElementById("mainForm");

  //all inputs with the class required are looped through
  const requiredInputs = document.querySelectorAll(".required");
  for (let i = 0; i < requiredInputs.length; i++) {
    requiredInputs[i].onfocus = function () {
      this.style.fontWeight = "bold";
      this.style.backgroundColor = "green";
    }
    requiredInputs[i].onblur = function () {
      //TODO,
      //highlight an error if no value
      this.style.fontWeight = "normal";
      highlightError(this, checkInvalidInput(this));
    }

    if (requiredInputs[i].type === "checkbox") {
      requiredInputs[i].addEventListener("change", function (e) {
        highlightError(e.target, checkInvalidInput(e.target));

      })
    }

  }

  //on submitting the form, "empty" checks are performed on required inputs.
  mainForm.onsubmit = function (e) {
    let sum = 0;
    let inputInvalid;
    for (let i = 0; i < requiredInputs.length; i++) {
      // check if input is invalid
      inputInvalid = checkInvalidInput(requiredInputs[i])
      if (!inputInvalid) {
        sum++;
        continue;
      }
      highlightError(requiredInputs[i], inputInvalid);
    }
    console.log(sum)
    if (sum === 3) { // if all valid then show the alert
      alert('You have submitted the form');
    } else { // if one of the input is invalid then cancel the submission
      e.preventDefault(); // this will prevent the default submit form action, i.e., reloading the webpage
    }
  }
}



