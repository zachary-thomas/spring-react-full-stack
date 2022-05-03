import { Button } from 'antd';
import './App.css';

import {getAllStudents} from "./Client";

function App() {

  getAllStudents()
    .then(response => response.json())
    .then(console.log);

  return (
    <div className="App">
      <Button type='primary'>Hello</Button>
    </div>
  );
}

export default App;
