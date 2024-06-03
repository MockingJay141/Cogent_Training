

const { MongoClient } = require('mongodb');
const url = 'mongodb://0.0.0.0:27017';
const database = 'cogent'
const client = new MongoClient(url);
async function getData() {
    let result = await client.connect();
    let db = result.db(database);
    let collection = db.collection('trainees');
    var query={
        "user_id":10,
        "username":"Ayobami",
        "location":"USA",
        "phone":234567456,
        "interest":['Bikes','Cricket','Travel']
}
await collection.insertOne(query);
  console.log("Document inserted Successfully");
   /*
    let response = await collection.find({}).toArray();
    console.log(response); */
    client.close();
}
getData(); 