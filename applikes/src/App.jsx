import { Post } from "./components/Post"
import { Header } from "./components/Header"
import { Sidebar } from "./components/Sidbar"
import styles from "./app.module.css"
import './global.css'
export function App() {
  return (
    <div>
      <Header/>
      <div className={styles.wrapper}>
      <Sidebar/>
        <main>
         <Post/>
         <Post/>
        </main>
      </div>
    </div>
  )
}
