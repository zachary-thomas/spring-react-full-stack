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
    console.log("Component is mounted")
      fetchStudents();
  }, [])

  return (
    <div className="App">
        {students.length}
    </div>
  );
}

export default App;
