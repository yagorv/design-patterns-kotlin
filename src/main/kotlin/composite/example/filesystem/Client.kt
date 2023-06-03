package composite.example.filesystem

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        val root = Directory("root")

        val documents = Directory("Documentos")
        val music = Directory("Música")
        val pictures = Directory("Imágenes")

        val resume = File("curriculum.pdf")
        val song1 = File("cancion1.mp3")
        val photo1 = File("foto1.jpg")
        val photo2 = File("foto2.jpg")

        root.add(documents)
        root.add(music)
        root.add(pictures)

        documents.add(resume)
        music.add(song1)
        pictures.add(photo1)
        pictures.add(photo2)

        root.display()
    }
}