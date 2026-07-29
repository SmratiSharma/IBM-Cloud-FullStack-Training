const os = require('os');
const fs = require('fs');
const http = require('http');
const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');

// console.log(os.arch(), os.freemem(), os.homedir(), os.hostname(), os.uptime());
// fs.readFileSync('names.txt', (err, data) => {
//     if(err) {
//         console.log(err);
//     }
//     else{
//         console.log(data.toString());
//     }
// })

// const myServer = http.createServer((req, res) => {
//     if(req.url === '/start'){
//         res.write("Hello from the server");
//         res.end();
//     }
// })

// myServer.listen(8000, () => {
//     console.log("Server is running on port 8000");
// });


const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.json());

app.get('/login', async(req, res) => {
    await res.sendFile(path.join(__dirname, '..', 'index.html'));
});

app.get('/home', (req, res) => {
    res.json({
        name: 'Smrati',
        role: 'Learner'
    });
});

app.post('/login', (req, res) =>{
    const email = req.body.email;
    const pass = req.body.pass;

    if(email === 'smratiIbm4567@gmail.com' && pass === 'password'){
        res.json({
            name: 'Smrati',
            role: 'Learner',
            msg: 'Please learn Bro'
        });
    } else {
        res.status(401).json({
            error : 'Invalid credentials'
        });
    }
})

app.listen(9000, () => {
    console.log("Server is running on port 9000");
});