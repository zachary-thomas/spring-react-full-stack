import { useState, useEffect } from "react";

import {getAllStudents} from "./Client";

function App() {
  const [students, setStudents] = useState([]);

  const fetchStudents = () =>
      getAllStudents()
          .then(response => response.json())
          .then(data => {
              console.log(data);
              setStudents(data);
          });

  // 0 Dependencies, will run once when mounted
  useEffect(() => {
    console.log("Component is mounted");
    fetchStudents();
  }, [])

  if(students.length <=0){
    return "No data";
  }

  return students.map((student, index)=> {
    <p key={index}>{student.id} {student.name}</p>
  })

}

export default App;
