const companyDetails = [
    {
        "name": "UST",
        "founded": 2000,
        "employees": 400
    },
    {
        "name": "Envestnet",
        "founded": 2015,
        "employees": 200
    }
];
//convert this to string
const companyString = JSON.stringify(companyDetails);
//create parser for this info
const companyParse = JSON.parse(companyString);
//print all this oe by one
console.log("Normal json object= ", companyDetails);
console.log("As a string: ", companyString);
companyParse.forEach(element => {
    console.log("name: ", element.name);
    console.log("founded: ", element.founded);
    console.log("employees: ", element.employees);
});