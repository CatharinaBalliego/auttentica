CREATE TABLE categoria_produto_tb (
    categoria_produto_id SERIAL PRIMARY KEY,
    tipo_segmento_id INT NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    FOREIGN KEY (tipo_segmento_id) REFERENCES tipo_segmento_tb(tipo_segmento_id)
);

CREATE TABLE sub_categoria_produto_tb (
    sub_categoria_produto_id SERIAL PRIMARY KEY,
    categoria_produto_id INT NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    FOREIGN KEY (categoria_produto_id) REFERENCES categoria_produto_tb(categoria_produto_id)
);

CREATE TABLE produto_tb (
    produto_id SERIAL PRIMARY KEY,
    empresa_id INT NOT NULL,
    sub_categoria_produto_id INT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(100),
    imagem TEXT NOT NULL,
    url TEXT NOT NULL,
    preco DOUBLE PRECISION NOT NULL,
    composicao VARCHAR(255),
    data_cadastro DATE NOT NULL DEFAULT CURRENT_DATE,
    FOREIGN KEY (empresa_id) REFERENCES empresa_tb(empresa_id) ON DELETE CASCADE,
    FOREIGN KEY (sub_categoria_produto_id) REFERENCES sub_categoria_produto_tb(sub_categoria_produto_id)
);
