function validate(id) {
    var name = document.getElementById(id).value;
    if (name == '') {
        alert('Please enter a valid name.');
        return false;
    } else {
        return true;
    }
}