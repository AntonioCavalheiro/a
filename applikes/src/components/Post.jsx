import styles from"./Post.module.css"
import { Comment } from "./Comment"
export function Post(){
    return(
        <article className={styles.post}>
            <header>
                <div className={styles.author}>
                    <img 
                        className={styles.avatar} 
                        src="https://github.com/AntonioCavalheiro.png"
                    />
                    <div className={styles.authorInfo}>
                        <strong>Antonio Gabriel</strong>
                        <span>Web Developer</span>
                    </div>
                </div>
                <time
                    title="10 de setembro às 9:46" dateTime="2024/09/10 09:46:00"
                >Publicado há 1h</time>
            </header>
            <div className={styles.content}>
                <p>Fala galera !!!</p>
                <p>Amanhã teremos viagem a Bienal!! </p>
                <p>
                    <a href="#">#bienaldolivrosp</a>
                    <a href="#">#eteccidadedolivro</a>
                    <a href="#">#vemparaetec</a>
                </p>
            </div>
            <form className={styles.commentForm}>
                <strong>Deixe seu feedback!</strong>
                <textarea placeholder="Deixe um comentário"></textarea>
                <footer>
                <button type="submit">Publicar</button>
                </footer>
            </form>
            <div className={styles.commentList}>
                <Comment/>
                <Comment/>
                <Comment/>
            </div>
        </article>
    )
}